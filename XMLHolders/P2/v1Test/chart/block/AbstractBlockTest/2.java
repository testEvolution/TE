@Test
    public void testSerialization() {
        EmptyBlock b1 = new EmptyBlock(1.0, 2.0);
        EmptyBlock b2 = (EmptyBlock) TestUtils.serialised(b1);
        assertEquals(b1, b2);
    }

}