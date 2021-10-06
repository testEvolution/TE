@Test
    public void testSerialization() {
        // test a default instance
        DialCap c1 = new DialCap();
        DialCap c2 = (DialCap) TestUtils.serialised(c1);
        assertEquals(c1, c2);

        // check that the listener lists are independent
        MyDialLayerChangeListener l1 = new MyDialLayerChangeListener();
        c1.addChangeListener(l1);
        assertTrue(c1.hasListener(l1));
        assertFalse(c2.hasListener(l1));
    }

}