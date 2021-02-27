package com.company;

public class Android extends MobilePhone {

    protected float m_android_os;

    public Android(String m_color, double m_size, float m_android_os) {
        super(m_color, m_size);
        this.m_android_os = m_android_os;
    }

    public float getAndroidOs(){
        return m_android_os;
    }

    @Override
    public String toString() {
        return "Android{" +
                "m_android_os=" + m_android_os +
                '}' + super.toString();
    }
}
