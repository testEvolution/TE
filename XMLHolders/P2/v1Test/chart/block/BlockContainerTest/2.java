@Test
    public void testSerialization() {
        BlockContainer c1 = new BlockContainer();
        c1.add(new EmptyBlock(1.2, 3.4));
        BlockContainer c2 = (BlockContainer) TestUtils.serialised(c1);
        assertEquals(c1, c2);
    }

}