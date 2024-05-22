<!-- generated file - do not edit -->
# 🔗 `{{ (datasource "genesis").chain_id }}`

![chain-id](https://img.shields.io/badge/chain%20id-{{ (datasource "genesis").chain_id | urlquery | strings.ReplaceAll "-" "--" }}-blue?style=for-the-badge)
[![stability-deprecated](https://img.shields.io/badge/stability-deprecated-922b21.svg?style=for-the-badge)](https://github.com/mkenney/software-guides/blob/master/STABILITY-BADGES.md#deprecated)
![audience](https://img.shields.io/badge/audience-restricted-orange.svg?style=for-the-badge)
![incentivized-✖️](https://img.shields.io/badge/incentivized-✖️-29220A.svg?style=for-the-badge)
![genesis-time](https://img.shields.io/badge/{{ "⏰" | urlquery }}%20genesis%20time-{{ (datasource "genesis").genesis_time | urlquery | strings.ReplaceAll "-" "--" }}-red?style=for-the-badge)

> [!IMPORTANT]
> This network was originally created under the former `OKP4` brand.

The main development network, intended primarily for use by the OKP4 core team. This `devnet` functions as a "playground" for those looking to experiment with the protocol as a blockchain user, token holder, application developer or network validator.

This network is very unstable, and the whole blockchain can be reset, deleting all blocks.
