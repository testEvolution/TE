@Test
    public void testEquals() {
       WindNeedle n1 = new WindNeedle();
       WindNeedle n2 = new WindNeedle();
       assertTrue(n1.equals(n2));
       assertTrue(n2.equals(n1));
    }

    