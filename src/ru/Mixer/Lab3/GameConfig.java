package ru.Mixer.Lab3;

import java.io.Serializable;

public class GameConfig implements Serializable {
    private String ip;
    private int port;
    private int difficulty;
    private long updatePeriod;
    private int savePeriod;

    public GameConfig(String ip, int port, int difficulty, long updatePeriod, int savePeriod) {
        this.ip = ip;
        this.port = port;
        this.difficulty = difficulty;
        this.updatePeriod = updatePeriod;
        this.savePeriod = savePeriod;
    }

    public GameConfig() {
        this.difficulty = 2;
        this.port = 25565;
        this.ip = "127.0.0.1";
        this.updatePeriod = 1000;
        this.savePeriod = 5;
    }

    @Override
    public String toString() {
        return "GameConfig{" +
                "ip='" + ip + '\'' +
                ", port=" + port +
                ", difficulty=" + difficulty +
                ", updatePeriod=" + updatePeriod +
                ", savePeriod=" + savePeriod +
                '}';
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    public long getUpdatePeriod() {
        return updatePeriod;
    }

    public void setUpdatePeriod(long updatePeriod) {
        this.updatePeriod = updatePeriod;
    }

    public int getSavePeriod() {
        return savePeriod;
    }

    public void setSavePeriod(int savePeriod) {
        this.savePeriod = savePeriod;
    }
}
