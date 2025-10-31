package ar.unahur.edu.obj2.patroncommand.operaciones;

import ar.unahur.edu.obj2.patroncommand.mircocontrolador.Programable;

public class Ifnz extends Comando{

    @Override
    protected void doExecute(Programable micro) {
        if (micro.getAcumuladorA() != 0) {
            micro.incProgramCounter();
        }
    }
}