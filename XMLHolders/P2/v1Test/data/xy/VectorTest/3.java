@Test
    public void testSerialization() {
        Vector v1 = new Vector(1.0, 2.0);
        Vector v2 = (Vector) TestUtils.serialised(v1);
        assertEquals(v1, v2);
    }

}