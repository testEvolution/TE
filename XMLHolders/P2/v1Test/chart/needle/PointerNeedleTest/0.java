@Test
    public void testEquals() {
       PointerNeedle n1 = new PointerNeedle();
       PointerNeedle n2 = new PointerNeedle();
       assertTrue(n1.equals(n2));
       assertTrue(n2.equals(n1));
    }

    