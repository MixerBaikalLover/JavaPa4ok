package ru.Mixer.Computer;

import java.util.Arrays;

public class Computer {
    private CPU cpu;
    private GPU gpu;
    private Memory[] memoriesBlocks;


    public Computer(CPU cpu, GPU gpu, Memory[] memoriesBlocks) {
        this.cpu = cpu;
        this.gpu = gpu;
        this.memoriesBlocks = memoriesBlocks;
    }

    public Computer copy() {
        Computer pc1 = new Computer(cpu.copy(), gpu.copy(), new Memory[memoriesBlocks.length]);
        for (int i = 0; i < memoriesBlocks.length; i++) {
            pc1.getMemoriesBlocks()[i] = memoriesBlocks[i].copy();
        }
        return (pc1);
    }


    public float getRating(CPU cpu, GPU gpu) {
        if (cpu.getMaxFrequency() != 0 && cpu.getCores() != 0 && gpu.getMemory() != 0) {
            if (gpu.isRtx() == false) {
                return (float) (cpu.getMaxFrequency() * 0.95 * cpu.getCores() + gpu.getMemory() * 0.2);
            } else return (float) (cpu.getMaxFrequency() * 0.95 * cpu.getCores() + gpu.getMemory() * 0.2 + 1);
        }
        return (0);
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu=" + cpu +
                ", gpu=" + gpu +
                ", memoriesBlocks=" + Arrays.toString(memoriesBlocks) +
                '}';
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public GPU getGpu() {
        return gpu;
    }

    public void setGpu(GPU gpu) {
        this.gpu = gpu;
    }

    public Memory[] getMemoriesBlocks() {
        return memoriesBlocks;
    }

    public void setMemoriesBlocks(Memory[] memoriesBlocks) {
        this.memoriesBlocks = memoriesBlocks;
    }
}

