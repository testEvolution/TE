@Test
    public void testMinuss9999Previous() {
        Year current = new Year(-9999);
        Year previous = (Year) current.previous();
        assertNull(previous);
    }

    