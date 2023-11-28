
package arabamustafa;


public class Arabamustafa{
    private String renk;
    private  int kapilar;
    private int telerlekler;
    private String motor;
    private String model;
    
    /*
    public String renk;
    public  int kapilar;
    public int telerlekler;
    public String motor;
    public String model;
*/
    public void setModel(String model){
        
        this.model = model;
        
    }
    public String getModel(){
        return this.model;
    }

    /**
     * @return the renk
     */
    public String getRenk() {
        return renk;
    }

    /**
     * @param renk the renk to set
     */
    public void setRenk(String renk) {
        this.renk = renk;
    }

    /**
     * @return the kapilar
     */
    public int getKapilar() {
        return kapilar;
    }

    /**
     * @param kapilar the kapilar to set
     */
    public void setKapilar(int kapilar) {
        this.kapilar = kapilar;
        if(kapilar<0)
            System.out.println("kapı sayısı sıfrdan buyuk olması ");
    }

    /**
     * @return the telerlekler
     */
    public int getTelerlekler() {
        return telerlekler;
    }

    /**
     * @param telerlekler the telerlekler to set
     */
    public void setTelerlekler(int telerlekler) {
        this.telerlekler = telerlekler;
    }

    /**
     * @return the motor
     */
    public String getMotor() {
        return motor;
    }

    /**
     * @param motor the motor to set
     */
    public void setMotor(String motor) {
        this.motor = motor;
    }
}
