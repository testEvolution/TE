@Test
    public void testEquals() {
       MiddlePinNeedle n1 = new MiddlePinNeedle();
       MiddlePinNeedle n2 = new MiddlePinNeedle();
       assertTrue(n1.equals(n2));
       assertTrue(n2.equals(n1));
    }

    