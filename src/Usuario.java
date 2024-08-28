public class Usuario {
    public static void main(String[] args) throws Exception {

        // objeto
        SmartTv tv = new SmartTv();

        // estado inicial sem os metodos
        System.out.println("TV Ligada? " + tv.ligada);
        System.out.println("Canal atual:  " + tv.canal);
        System.out.println("Volume: " + tv.volume);

        // estado com os metodos

        // ligar tv
        tv.ligar();
        System.out.println("TV Ligada? " + tv.ligada);

        // desligar tv
        tv.desligar();
        System.out.println("TV Ligada? " + tv.ligada);

        // aumentar volume
        tv.aumentarVolume();
        System.out.println("Volume: " + tv.volume);

        // diminuir volume
        tv.diminuirVolume();
        System.out.println("Volume: " + tv.volume);

        // aumentando de canal
        tv.aumentarCanal();
        System.out.println("aumentando o canal: " + tv.canal);

        // diminuindo de canal
        tv.diminuirCanal();
        System.out.println("diminuindo o canal: " + tv.canal);

        // mudando para qualquer outro canal
        tv.mudarCanal(13);
        System.out.println("Mundando para o canal desejado: " + tv.canal);

    }
}
