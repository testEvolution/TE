@Test
    public void testSerialization() {
        PinNeedle n1 = new PinNeedle();
        PinNeedle n2 = (PinNeedle) TestUtils.serialised(n1);
        assertTrue(n1.equals(n2));
    }

}