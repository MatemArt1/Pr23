import java.util.BitSet;
public class Like23 {
    public class MySolution {

        public int computeDepth(int n) {
            BitSet digits = new BitSet(10);
            int i = 0;
            while (digits.cardinality() < 10) {
                i++;
                for (long t = (long)n * i; t != 0; t /= 10)
                    digits.set((int)(t % 10));
            }
            return i;
        }

    }
}
