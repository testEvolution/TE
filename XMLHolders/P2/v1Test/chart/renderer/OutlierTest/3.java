@Test
    public void testSerialization() {
        Outlier out1 = new Outlier(1.0, 2.0, 3.0);
        assertFalse(out1 instanceof Serializable);
    }

}