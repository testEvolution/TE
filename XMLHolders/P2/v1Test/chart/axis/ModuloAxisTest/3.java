@Test
    public void testSerialization() {
        ModuloAxis a1 = new ModuloAxis("Test", new Range(0.0, 1.0));
        ModuloAxis a2 = (ModuloAxis) TestUtils.serialised(a1);
        assertEquals(a1, a2);
    }

}