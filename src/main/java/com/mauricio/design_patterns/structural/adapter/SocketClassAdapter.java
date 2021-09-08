package com.mauricio.design_patterns.structural.adapter;
/*
    While implementing Adapter pattern, there are two approaches – class adapter and object adapter –
    however both these approaches produce same result.

    -Here is the class adapter approach implementation of our adapter.
*/
public class SocketClassAdapter extends Socket implements SocketAdapter{

    @Override
    public Volt get120Volt() {
        return getVolt();
    }

    @Override
    public Volt get12Volt() {
        return convertVolt(getVolt(), 10);
    }

    @Override
    public Volt get3Volt() {
        return convertVolt(getVolt(), 40);
    }

    private Volt convertVolt(Volt v, int i) {
        return new Volt(v.getVolts() / i);
    }
}
