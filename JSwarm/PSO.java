import net.sourceforge.jswarm_pso.Swarm;

public class PSO {
	public static void getOptimalWeights() {
		Swarm swarm = new Swarm(Swarm.DEFAULT_NUMBER_OF_PARTICLES
				, new TParticle()
				, new TFitnessFunction());
		// Set position (and velocity) constraints. 
		// i.e.: where to look for solutions
		swarm.setMaxPosition(1);
		swarm.setMinPosition(0);
		// Optimize a few times
		for( int i = 0; i < 20; i++ ) swarm.evolve();
		// Print en results
		System.out.println(swarm.toStringStats());
	}

	public static void main(String[] args) {
		getOptimalWeights();
	}
}