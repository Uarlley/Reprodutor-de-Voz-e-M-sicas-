package vozeletronicacartoescredito;

import static java.lang.Math.pow;

public class AudioValores {
    /*os elementos dos enumeradores devem ter o mesmo nome de cada arquivo de voz .wav correspondente */
    public enum unidade {um, dois, tres, quatro, cinco, seis, sete, oito, nove};
    public enum dez_dezenove {dez, onze, doze, treze, quatorze, quinze, dezeseis, dezesete, dezoito, dezenove};
    public enum dezena {dez, vinte, trinta, quarenta, cinquenta, sessenta, setenta, oitenta, noventa};
    public enum centena {cento, duzentos, trezentos, quatrocentos, quinhentos, seiscentos, setecentos, oitocentos, novecentos};    
    public enum mil_quadrilhao{mil, milhao, bilhao, trilhao, quadrilhao};
    public enum mil_quadrilhaoP{mil, milhoes, bilhoes, trilhoes, quadrilhoes};
    
    public int calculaTamanho(long valor) {
        long num = valor;
        int tam=0;
        while(num !=0) { 
           num = num/10; 
           tam++; 
        }
        return tam;
    }
    
     
    public void audio_Centena(long valor, String Diretorio, String tipo) throws Exception{
        int oqFalar;
        long time = 0;
        oqFalar = (calculaTamanho(valor)-1)/3-1;
        while(oqFalar > 0){           
            long comp = (long)pow(10,(oqFalar+1)*3);
            if(valor/comp == 1) 
                audio_Centena(valor/comp,Diretorio, "" + mil_quadrilhao.values()[oqFalar]);
            else audio_Centena(valor/comp,Diretorio, "" + mil_quadrilhaoP.values()[oqFalar]);
            valor = valor%comp;
            oqFalar = (calculaTamanho(valor)-1)/3-1;          
        }
        
        int i_centena, i_dezena, i_unidade, played = 0;
        ExecutaSom play = new ExecutaSom();//Define objeto play da Classe ExecutaSom
        
        if(valor == 0){ 
                time = play.executaSom(Diretorio+"De.wav",false,0);/* Utiliza o enumerador centena para concatenar o caminho de onde estão os arquivos de som */
                Thread.sleep(time - 200);//Para estabelecer um intervalo entre os sons
                time = play.executaSom(Diretorio+ tipo + ".wav",false,0);
                Thread.sleep(time);
        }
        
        if(valor >= 1000){
            if(valor/1000 == 1){
                time = play.executaSom(Diretorio+"Mil.wav",false,0);
                Thread.sleep(time - 200);
                played++;
            }
            else audio_Centena(valor/1000, Diretorio, "Mil");
            valor = valor%1000;
            //played++;
        }
        
        i_centena= (int)valor/100;
        i_dezena= (int)(valor%100)/10;
        i_unidade= (int)valor%10;  

        /*Concatena o diretório onde estão os arquivos de aúdio, 
        nome do arquivo localizado no enumerado e extensão .wav*/
        if(i_centena!=0){
            if(valor == 100){
                time = play.executaSom(Diretorio+"Cem.wav",false,0);/* Utiliza o enumerador centena para concatenar o caminho de onde estão os arquivos de som */
                Thread.sleep(time - 200);//Para estabelecer um intervalo entre os sons
            }
            else{
                time = play.executaSom(Diretorio+centena.values()[i_centena-1]+".wav",false,0);/* Utiliza o enumerador centena para concatenar o caminho de onde estão os arquivos de som */
                Thread.sleep(time - 200);//Para estabelecer um intervalo entre os sons
            }
            played++;

        }
        if(valor%100 >= 10 && valor%100 <= 19){
            if(played>0){
                time = play.executaSom(Diretorio+"ETeste.wav",false,-5.0f);
                Thread.sleep(time - 200);//Para estabelecer um intervalo para os possíveis próximos sons
            }
            time = play.executaSom(Diretorio + dez_dezenove.values()[i_unidade]+".wav",false,0);
            Thread.sleep(time - 200);//Para estabelecer um intervalo para os possíveis próximos sons
            played++;
        }
        else{
            if(i_dezena!=0){
                if(played>0){
                    time = play.executaSom(Diretorio+"ETeste.wav",false,-5.0f);
                    Thread.sleep(time - 300);//Para estabelecer um intervalo para os possíveis próximos sons
                }
                time = play.executaSom(Diretorio+dezena.values()[i_dezena-1]+".wav",false,0);
                Thread.sleep(time - 300);//Para estabelecer um intervalo entre os sons
                played++;
            }
            if(i_unidade!=0){
                if(played>0){
                    
                    time = play.executaSom(Diretorio+"ETeste.wav",false,-5.0f);
                    Thread.sleep(time - 200);//Para estabelecer um intervalo para os possíveis próximos sons
                }
                time = play.executaSom(Diretorio+unidade.values()[i_unidade-1]+".wav",false,0);
                Thread.sleep(time - 200);//Para estabelecer um intervalo entre os sons
                played++;
            }
        }
        if(played>0){
            time = play.executaSom(Diretorio+ tipo + ".wav",false,0);
            Thread.sleep(time);//Para estabelecer um intervalo entre os possí­veis próximos sons
        }
    }
}