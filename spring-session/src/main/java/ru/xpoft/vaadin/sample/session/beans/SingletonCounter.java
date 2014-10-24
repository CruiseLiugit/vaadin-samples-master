package ru.xpoft.vaadin.sample.session.beans;

import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @author xpoft
 */
@Component
public class SingletonCounter implements Serializable
{
    private int count = 0;

    public int getCount()
    {
        return ++count;
    }
}
