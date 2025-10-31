package ar.unahur.edu.obj2.patroncommand.mircocontrolador;
import java.util.Arrays;
import java.util.List;

import ar.unahur.edu.obj2.patroncommand.excepciones.IllegalArgumentException;
import ar.unahur.edu.obj2.patroncommand.operaciones.Operable;

public class Microcontrolador implements Programable{
    private Integer acumuladorA = 0;
    private Integer acumuladorB = 0;
    private Integer programCounter = 0;
    private List<Operable> memoria = Arrays.asList(new Operable[1024]);

    public Microcontrolador() {
        this.acumuladorA = 0;
        this.acumuladorB = 0;
        this.programCounter = 0;
        this.memoria = Arrays.asList(new Operable[1024]);
    }

    public Microcontrolador(Integer acumuladorA, Integer acumuladorB, Integer programCounter, List<Operable> memoria) {
        this.acumuladorA = acumuladorA;
        this.acumuladorB = acumuladorB;
        this.programCounter = programCounter;
        this.memoria = memoria;
    }

    @Override
    public Integer getAcumuladorA() {
        return acumuladorA;
    }

    @Override
    public void setAcumuladorA(Integer acumuladorA) {
        this.acumuladorA = acumuladorA;
    }

    @Override
    public Integer getAcumuladorB() {
        return acumuladorB;
    }

    @Override
    public void setAcumuladorB(Integer acumuladorB) {
        this.acumuladorB = acumuladorB;
    }

    @Override
    public Integer getProgramCounter() {
        return programCounter;
    }

    public void setProgramCounter(Integer programCounter) {
        this.programCounter = programCounter;
    }

    public List<Operable> getMemoria() {
        return memoria;
    }

    public void setMemoria(List<Operable> memoria) {
        this.memoria = memoria;
    }

    public void estaEnRango(Integer direccionMemoria){
        if (direccionMemoria < 0 || direccionMemoria >= memoria.size()){
            throw new IllegalArgumentException("Direccion de memoria fuera de rango");
        }
    }

    @Override
    public Programable copiar() {
        Microcontrolador nuevo = new Microcontrolador();
        nuevo.acumuladorA = this.acumuladorA;
        nuevo.acumuladorB = this.acumuladorB;
        nuevo.programCounter = this.programCounter;
        return nuevo;
    }

    @Override
    public void copiarDesde(Programable programable) {
        programCounter = programable.getProgramCounter();
        acumuladorA = programable.getAcumuladorA();
        acumuladorB = programable.getAcumuladorB();
    }

    @Override
    public Integer getAddr(Integer addr) {
        return addr;
    }

    @Override
    public void incProgramCounter() {
        this.programCounter ++;
    }

    @Override
    public void reset() {
        acumuladorA = 0;
        acumuladorB = 0;
        programCounter = 0;
        memoria = Arrays.asList(new Operable[1024]);
    }

    @Override
    public void run(List<Operable> operaciones) {
        operaciones.forEach(operacion -> operacion.execute(this));
    }

    @Override
    public void setAddr(Integer addr) {
        estaEnRango(addr);
        programCounter = addr;
    }
}