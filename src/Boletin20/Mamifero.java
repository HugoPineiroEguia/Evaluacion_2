
package Boletin20;

public class Mamifero implements IPodeCaminar, IPodeNadar{

    @Override
    public void caminar(){
        System.out.println("*camina*");
    }

    @Override
    public void nadar(){
        System.out.println("*nada*");
    }

}
