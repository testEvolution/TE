@Test
    public void testSerialization() {
        VectorRenderer r1 = new VectorRenderer();
        VectorRenderer r2 = (VectorRenderer) TestUtils.serialised(r1);
        assertEquals(r1, r2);
    }

}