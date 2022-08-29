package chapter10.interfaces.interfaceprocessor;

import chapter10.interfaces.filters.Filter;
import chapter10.interfaces.filters.Waveform;

/**
 * @author: ymm
 * @date: 2022/8/29
 * @version: 1.0.0
 * @description:
 */
public class FilterAdapter implements Processor {
    Filter filter;

    public FilterAdapter(Filter filter) {
        this.filter = filter;
    }

    @Override
    public String name() {
        return filter.name();
    }

    @Override
    public Waveform process(Object input) {
        return filter.process((Waveform) input);
    }
}
