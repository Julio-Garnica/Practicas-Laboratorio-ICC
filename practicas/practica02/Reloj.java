public class Reloj{
    private Manecilla manecilla;

    public Reloj(int manecillaHoras, int manecillaMinutos, int manecillaSegundos) {
        this.manecilla = new Manecilla(manecillaHoras, manecillaMinutos, manecillaSegundos);
    }

    public void avanzarSegundo(){
        manecilla.incrementarSegundos();
    }

    public String muestra (){
        String manecillaNuevaHoras = ((manecilla.getManecillaHoras() < 10) ? "0" + manecilla.getManecillaHoras() : String.valueOf(manecilla.getManecillaHoras()));
        String manecillaNuevaMinutos = ((manecilla.getManecillaMinutos() < 10) ? "0" + manecilla.getManecillaMinutos() : String.valueOf(manecilla.getManecillaMinutos()));
        String manecillaNuevaSegundos = ((manecilla.getManecillaSegundos() < 10) ? "0" + manecilla.getManecillaSegundos() : String.valueOf(manecilla.getManecillaSegundos())); 
        return "Son las " + manecillaNuevaHoras + ":" + manecillaNuevaMinutos + ":" + manecillaNuevaSegundos + " Hrs";
    }
}