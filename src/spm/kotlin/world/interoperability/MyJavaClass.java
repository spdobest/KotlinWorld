package spm.kotlin.world.interoperability;

public class MyJavaClass {

    public static void main(String... args) {
//        KotlinFileName kotlinFileName = new KotlinFileName();
        KotlinFileName.printKotlin();
        int volum = KotlinFileName.findVolume(2, 3);
    }

}
