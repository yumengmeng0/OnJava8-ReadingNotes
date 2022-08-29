package chapter10.interfaces.filters;

/**
 * @author: ymm
 * @date: 2022/8/29
 * @version: 1.0.0
 * @description:
 */
// 带通
public class BandPass extends Filter {
    double lowCutoff, highCutoff;

    public BandPass(double lowCutoff, double highCutoff) {
        this.lowCutoff = lowCutoff;
        this.highCutoff = highCutoff;
    }

    @Override
    public Waveform process(Waveform input) {
        return input;
    }

}
