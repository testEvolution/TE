@Test
    public void testEquals() {
       ArrowNeedle n1 = new ArrowNeedle(false);
       ArrowNeedle n2 = new ArrowNeedle(false);
       assertTrue(n1.equals(n2));
       assertTrue(n2.equals(n1));

       n1 = new ArrowNeedle(true);
       assertFalse(n1.equals(n2));
       n2 = new ArrowNeedle(true);
       assertTrue(n1.equals(n2));
    }

    