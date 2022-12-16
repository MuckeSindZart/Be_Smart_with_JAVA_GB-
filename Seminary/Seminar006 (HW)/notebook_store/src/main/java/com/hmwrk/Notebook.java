package com.hmwrk;

public class Notebook {
    private int serialNumber;
    private int hdd_volume;
    private int ram_volume;
    private int display_size;
    private String os_type;
    private String color;

    public Notebook(int serial_num, int hdd_volume, int ram_volume, int display_size, String os_type, String color) {
        this.serialNumber = serial_num;
        this.hdd_volume = hdd_volume;
        this.ram_volume = ram_volume;
        this.display_size = display_size;
        this.os_type = os_type;
        this.color = color;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((color == null) ? 0 : color.hashCode());
        result = prime * result + display_size;
        result = prime * result + hdd_volume;
        result = prime * result + serialNumber;
        result = prime * result + ((os_type == null) ? 0 : os_type.hashCode());
        result = prime * result + ram_volume;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Notebook other = (Notebook) obj;
        if (color == null) {
            if (other.color != null)
                return false;
        } else if (!color.equals(other.color))
            return false;
        if (display_size != other.display_size)
            return false;
        if (hdd_volume != other.hdd_volume)
            return false;
        if (serialNumber != other.serialNumber)
            return false;
        if (os_type == null) {
            if (other.os_type != null)
                return false;
        } else if (!os_type.equals(other.os_type))
            return false;
        if (ram_volume != other.ram_volume)
            return false;
        return true;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int sn) {
        this.serialNumber = sn;
    }

    public int getHDDvolume() {
        return hdd_volume;
    }

    public void setHDDvolume(int volume) {
        this.hdd_volume = volume;
    }

    public int getRAMvolume() {
        return ram_volume;
    }

    public void setRAMvolume(int volume) {
        this.ram_volume = volume;
    }

    public int getDisplSize() {
        return display_size;
    }

    public void setDisplSize(int size) {
        this.display_size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOStype() {
        return os_type;
    }

    public void setOStype(String type) {
        this.os_type = type;
    }

    @Override
    public String toString() {
        return "{serial_num=" + serialNumber
                + ",\tcolor=" + color
                + ",\tdisplay_size=" + display_size
                + ",\thdd_volume=" + hdd_volume
                + ",\tram_volume=" + ram_volume
                + ",\tos_type=" + os_type + "}";
    }

}
