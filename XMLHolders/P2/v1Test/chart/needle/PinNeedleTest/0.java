@Test
    public void testEquals() {
       PinNeedle n1 = new PinNeedle();
       PinNeedle n2 = new PinNeedle();
       assertTrue(n1.equals(n2));
       assertTrue(n2.equals(n1));
    }

    