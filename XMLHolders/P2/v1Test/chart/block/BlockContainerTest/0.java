@Test
    public void testEquals() {
        BlockContainer c1 = new BlockContainer(new FlowArrangement());
        BlockContainer c2 = new BlockContainer(new FlowArrangement());
        assertTrue(c1.equals(c2));
        assertTrue(c2.equals(c2));

        c1.setArrangement(new ColumnArrangement());
        assertFalse(c1.equals(c2));
        c2.setArrangement(new ColumnArrangement());
        assertTrue(c1.equals(c2));

        c1.add(new EmptyBlock(1.2, 3.4));
        assertFalse(c1.equals(c2));
        c2.add(new EmptyBlock(1.2, 3.4));
        assertTrue(c1.equals(c2));
    }

    