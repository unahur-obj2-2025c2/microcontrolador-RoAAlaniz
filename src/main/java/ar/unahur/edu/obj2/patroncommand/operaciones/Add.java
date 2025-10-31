package ar.unahur.edu.obj2.patroncommand.operaciones;
import ar.unahur.edu.obj2.patroncommand.mircocontrolador.Programable;

public class Add extends Comando{

    @Override
    protected void doExecute(Programable micro) {
        Integer resultado = micro.getAcumuladorA() + micro.getAcumuladorB();
        micro.setAcumuladorA(resultado);
        micro.setAcumuladorB(0);    
    }
}