@Test
    public void testSerialization() {
        CyclicNumberAxis a1 = new CyclicNumberAxis(10, 0, "Test Axis");
        CyclicNumberAxis a2 = (CyclicNumberAxis) TestUtils.serialised(a1);
        assertEquals(a1, a2);
    }

}