private BlockContainer createTestContainer1() {
        Block b1 = new EmptyBlock(10, 11);
        Block b2 = new EmptyBlock(20, 22);
        Block b3 = new EmptyBlock(30, 33);
        BlockContainer result = new BlockContainer(new GridArrangement(1, 3));
        result.add(b1);
        result.add(b2);
        result.add(b3);
        return result;
    }

    