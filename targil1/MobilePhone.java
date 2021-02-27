package com.company;

public class MobilePhone {

    protected String m_color;
    protected double m_size;

    public MobilePhone(String m_color, double m_size) {
        this.m_color = m_color;
        this.m_size = m_size;
    }

    public void getOs (){

    }

    @Override
    public String toString() {
        return "MobilePhone{" +
                "m_color='" + m_color + '\'' +
                ", m_size=" + m_size +
                '}';
    }
}
