package JSwarm;

import JSwarm.net.sourceforge.jswarm_pso.FitnessFunction;

public class TFitnessFunction extends FitnessFunction {
	public double evaluate(double position[]) {
		return position[0] + position[1]; // TODO:
	}
}