@Test
    public void testEquals() {
       PlumNeedle n1 = new PlumNeedle();
       PlumNeedle n2 = new PlumNeedle();
       assertTrue(n1.equals(n2));
       assertTrue(n2.equals(n1));
    }

    