@Test
    public void testEquals() {
       LongNeedle n1 = new LongNeedle();
       LongNeedle n2 = new LongNeedle();
       assertTrue(n1.equals(n2));
       assertTrue(n2.equals(n1));
    }

    