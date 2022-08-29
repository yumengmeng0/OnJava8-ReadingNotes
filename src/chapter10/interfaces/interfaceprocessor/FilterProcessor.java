package chapter10.interfaces.interfaceprocessor;

import chapter10.interfaces.filters.BandPass;
import chapter10.interfaces.filters.HighPass;
import chapter10.interfaces.filters.LowPass;
import chapter10.interfaces.filters.Waveform;

/**
 * @author: ymm
 * @date: 2022/8/29
 * @version: 1.0.0
 * @description:
 */
public class FilterProcessor {
    public static void main(String[] args) {
        Waveform waveform = new Waveform();
        Applicator.apply(new FilterAdapter(new LowPass(1.0)), waveform);
        Applicator.apply(new FilterAdapter(new HighPass(2.0)), waveform);
        Applicator.apply(new FilterAdapter(new BandPass(3.1,4.0)), waveform);

    }
}
