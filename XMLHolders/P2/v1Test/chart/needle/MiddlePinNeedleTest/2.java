@Test
    public void testSerialization() {
        MiddlePinNeedle n1 = new MiddlePinNeedle();
        MiddlePinNeedle n2 = (MiddlePinNeedle) TestUtils.serialised(n1);
        assertTrue(n1.equals(n2));
    }

}