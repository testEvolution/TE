@Test
    public void testSerialization() {
        WindNeedle n1 = new WindNeedle();
        WindNeedle n2 = (WindNeedle) TestUtils.serialised(n1);
        assertTrue(n1.equals(n2));
    }

}