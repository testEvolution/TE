@Test
    public void testEquals() {
       LineNeedle n1 = new LineNeedle();
       LineNeedle n2 = new LineNeedle();
       assertTrue(n1.equals(n2));
       assertTrue(n2.equals(n1));
    }

    