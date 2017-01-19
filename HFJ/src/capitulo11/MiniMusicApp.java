package capitulo11;

import javax.sound.midi.*;

public class MiniMusicApp {

    public static void main(String[] args) {
        MiniMusicApp mini = new MiniMusicApp();
        mini.play();
    }
    public void play(){

        try{
            Sequencer player = MidiSystem.getSequencer(); //Captura um objeto Sequencer
            player.open();                                //Abre o objeto Sequencer para usarmos (um sequenciador não vem aberto)
            Sequence seq = new Sequence(Sequence.PPQ,4);
            Track track = seq.createTrack();              //Solicita a Sequence um objeto Track. Os dados midi residem em Track

            ShortMessage a = new ShortMessage();
            a.setMessage(144,1,44,100);                 //(tipo da mensagem 144 = NOTE ON, canal, nota a reproduzir 0-127, velocidade)
            MidiEvent noteOn = new MidiEvent(a,1);      //momento em que a mensagem deve ser acionada
            track.add(noteOn);

            ShortMessage b = new ShortMessage();
            b.setMessage(128,1,44,100);                 //128 = NOTE OFF
            MidiEvent noteOff = new MidiEvent(b,16);
            track.add(noteOff);

            player.setSequence(seq); //Fornece a sequência ao Sequenciador

            player.start(); //Inicia o sequenciador
            Thread.sleep(1000*2);
            player.close();
            System.exit(0);

        } catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
