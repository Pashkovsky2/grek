
        import org.testng.annotations.
                Test ;class TestShort {

        @Test
        public void testshort(){

            summary((short) 6,(short) 5);
            vidn((short) 40,(short) 20);
            dilenya((short)60, (short) 20);
            mnozennya((short)30, (short) 10);
            ostacha((short)15, (short) 6);
        }
        public void summary(short one, short two){

            System.out.println(one+two);
        }
        public void vidn(short one, short two){

            System.out.println(one-two);
        }
        public void dilenya(short one, short two){

            System.out.println(one/two);
        }
        public void mnozennya(short one, short two){

            System.out.println(one*two);
        }
        public void ostacha(short one, short two){

            System.out.println(one%two);
        }

    }

