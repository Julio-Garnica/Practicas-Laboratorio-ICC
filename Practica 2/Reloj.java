public class Reloj{
    private Manecillas manecillas;

    public Reloj(int manecillaHoras, int manecillaMinutos, int manecillaSegundos) {
        this.manecillas = new Manecillas(manecillaHoras, manecillaMinutos, manecillaSegundos);
    }

    public void avanzarSegundo(){
        manecillas.incrementarSegundos();
    }

    public String muestra (){
        String manecillaNuevaHoras = ((manecillas.getManecillaHoras() < 10) ? "0" + manecillas.getManecillaHoras() : String.valueOf(manecillas.getManecillaHoras()));
        String manecillaNuevaMinutos = ((manecillas.getManecillaMinutos() < 10) ? "0" + manecillas.getManecillaMinutos() : String.valueOf(manecillas.getManecillaMinutos()));
        String manecillaNuevaSegundos = ((manecillas.getManecillaSegundos() < 10) ? "0" + manecillas.getManecillaSegundos() : String.valueOf(manecillas.getManecillaSegundos())); 
        return "Son las " + manecillaNuevaHoras + ":" + manecillaNuevaMinutos + ":" + manecillaNuevaSegundos + " Hrs";
    }
}