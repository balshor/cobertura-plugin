package hudson.plugins.cobertura.targets;

import java.io.Serializable;

import hudson.plugins.cobertura.Ratio;

public class CoverageTreeElement implements Serializable {

    /**
     * Generated
     */
    private static final long serialVersionUID = 498666415572813346L;

    private Ratio ratio;

    private CoverageMetric metric;

    public CoverageTreeElement(CoverageMetric metric, Ratio ratio) {
        this.metric = metric;
        this.ratio = ratio;
    }

    public String getName() {
        return metric.getName();
    }

    public float getRatio() {
        return ratio.getPercentageFloat();
    }

    public float getNumerator() {
        return ratio.numerator;
    }

    public float getDenominator() {
        return ratio.denominator;
    }
}
