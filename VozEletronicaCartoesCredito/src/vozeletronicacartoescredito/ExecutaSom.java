package vozeletronicacartoescredito;

import java.io.File;
/* Sons amostrados  */
import javax.sound.sampled.AudioInputStream; /* Amostragem de entrada de aúdio  */
import javax.sound.sampled.AudioSystem; /* Carrega os arquivos de aúdio para a memória em formato legível pelo sistema operacional*/
import javax.sound.sampled.Clip; /* Executa os sons no sistema operacional */
import javax.sound.sampled.FloatControl;


public class ExecutaSom {
    
    private Clip oClip;
    
    public long executaSom(String caminho, boolean modo_continuo, float decibeis) throws Exception {         

        //URL do som que no caso esta na pasta C:\VozEletronicaCartoesCredito\Sons       
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(caminho).getAbsoluteFile());
        oClip = AudioSystem.getClip();  
        oClip.open(audioInputStream); 
        FloatControl gainControl = (FloatControl) oClip.getControl(FloatControl.Type.MASTER_GAIN);
        gainControl.setValue(decibeis);
    
        if (modo_continuo) /* Flag usado para verificar se será tocado o som de forma repetida ou uma única vez  */
            oClip.loop(Clip.LOOP_CONTINUOUSLY); // Toca continuamente 
        else
            oClip.loop(0); // Toca apenas uma vez
        
        return oClip.getMicrosecondLength()/1000;
    }
    
    public void StopAudio() {
        if (oClip.isRunning()) oClip.stop();
    }
}