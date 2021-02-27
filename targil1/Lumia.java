package com.company;

public class Lumia extends MobilePhone{

    protected float m_ms_version;

    public Lumia(String m_color, double m_size, float m_ms_version) {
        super(m_color, m_size);
        this.m_ms_version = m_ms_version;
    }
    public float getMsOs(){
        return m_ms_version;
    }

    @Override
    public String toString() {
        return "Lumia{" +
                "m_ms_version=" + m_ms_version +
                '}'+ super.toString();
    }
}
