package MusicProg;

import javax.sound.midi.*;

public class MiniMiniMusicApp {
    public static void main (String [] args){
        MiniMiniMusicApp mini = new MiniMiniMusicApp();
        mini.play();
    }
    public void play(){
        try{
            Sequencer player = MidiSystem.getSequencer(); // 1. Получаем синтезатор и открываем его,
            player.open();                                // чтобы начать использовать(изначально он не открыт)

            Sequence seq = new Sequence(Sequence.PPQ, 4);  // 2. Заранее подготовленные аргументы

            Track track = seq.createTrack();              // 3. Запрашиваем трек у последовательности.
                                                          // !!! Трек содержится внутри последовательности,
                                                          // !!! а MIDI-данные в треке.

            ShortMessage a = new ShortMessage();          // 4. Помещаем в трек MIDI-события. Код заранее подготовлен
            a.setMessage(144,1,44,100);
            MidiEvent noteOn = new MidiEvent(a, 1);
            track.add(noteOn);

            ShortMessage c = new ShortMessage();          // 4. Помещаем в трек MIDI-события. Код заранее подготовлен
            a.setMessage(144,1,44,100);
            MidiEvent noteOn1 = new MidiEvent(c, 1);
            track.add(noteOn1);

            ShortMessage d = new ShortMessage();          // 4. Помещаем в трек MIDI-события. Код заранее подготовлен
            a.setMessage(144,1,44,100);
            MidiEvent noteOn2 = new MidiEvent(d, 1);
            track.add(noteOn2);


            ShortMessage b = new ShortMessage();          // 4. Помещаем в трек MIDI-события. Код заранее подготовлен
            a.setMessage(128,1,44,100);
            MidiEvent noteOff = new MidiEvent(b, 16);
            track.add(noteOff);

            player.setSequence(seq);                       // Передаем последовательность синтезатору
                                                           // (как будто вставляем CD в проигрыватель)

            player.start();                                 // 5. Запускаем синтезатор (нажимаем Play)

            Thread.sleep(5000);
            player.close();
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }
}