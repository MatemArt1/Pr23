public class Main {
    /*
    Integer depth.
    The depth of an integer n is defined to be how many multiples of n
    it is necessary to compute before all 10 digits have appeared at least once in some multiple.
example:
let see n=42

Multiple         value         digits     comment
42*1              42            2,4
42*2              84             8         4 existed
42*3              126           1,6        2 existed
42*4              168            -         all existed
42*5              210            0         2,1 existed
42*6              252            5         2 existed
42*7              294            9         2,4 existed
42*8              336            3         6 existed
42*9              378            7         3,8 existed
Looking at the above table under digits column you can find all the digits from 0 to 9,
Hence it required 942 multiples of to get all the digits. So the depth of 42 is 9.
Write a function named computeDepth which computes the depth of its integer argument.
Only positive numbers greater than zero will be passed as an input.
     */
    public class MySolution {
        public boolean enum1(int [] A)
        {
            for (int i = 0; i < A.length; i++)
            {
                if (A[i] == -1) return false;
            }
            return true;
        }
        public int computeDepth(int n) {
            // TODO implementation
            int [] A = new int[10];
            for (int k = 0; k < A.length; k++)
            {
                A[k] = -1;
            }
            int i = 0;
            while (!enum1(A))
            {
                i++;
                String s = Integer.toString(n*i);
                for (int j = 0; j < s.length(); j++)
                {
                    A[s.charAt(j) - '0'] = s.charAt(j) - '0';
                }
            }
            return i;
        }

    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}