package ADS;

import com.pi4j.io.i2c.*;

import java.io.IOException;

public class ADSReading implements I2CDevice {
    public int i2cAdress;

    @Override
    public int getAddress() {
        return 0;
    }

    @Override
    public void write(byte b) throws IOException {

    }

    @Override
    public void write(byte[] buffer, int offset, int size) throws IOException {

    }

    @Override
    public void write(byte[] buffer) throws IOException {

    }

    @Override
    public void write(int address, byte b) throws IOException {

    }

    @Override
    public void write(int address, byte[] buffer, int offset, int size) throws IOException {

    }

    @Override
    public void write(int address, byte[] buffer) throws IOException {

    }

    @Override
    public int read() throws IOException {
        return 0;
    }

    @Override
    public int read(byte[] buffer, int offset, int size) throws IOException {
        return 0;
    }

    @Override
    public int read(int address) throws IOException {
        return 0;
    }

    @Override
    public int read(int address, byte[] buffer, int offset, int size) throws IOException {
        return 0;
    }

    @Override
    public int read(byte[] writeBuffer, int writeOffset, int writeSize, byte[] readBuffer, int readOffset, int readSize) throws IOException {
        return 0;
    }
}
